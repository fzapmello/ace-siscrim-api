package br.gov.pf.ditec.siscrim.util;

import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class GoConverterUtil {


    private static final Pattern PATTERN = Pattern.compile("^\\s+(\\w+)\\s+(\\w+)\\s*$", Pattern.MULTILINE);

    public static void main(String[] args) {
        converterAtributos();
    }

    private static void converterAtributos() {
        StringBuilder output = new StringBuilder();

        StringBuilder input = new StringBuilder("\tUsername         string\n" +
                "\tAutenticado      bool\n" +
                "\tErroAutenticacao string");


        List<String> allAttributes = findAllAttributes(input.toString().replaceAll("\\*","").replaceAll("\\.", ""));

        allAttributes.stream().forEach(attribute -> {
            if (StringUtils.isNoneEmpty(attribute)) {
                String[] s = attribute.trim().split(" ");
                String nome = s[0];
                String tipo = s[s.length-1];
                output.append("private ");
                output.append(converterTipoGoParaJava(tipo));
                output.append(" ");
                output.append(formatarCamelCase(nome));
                output.append(";");
                output.append("\n");
            }
        });

        System.out.format(output.toString());
    }


    private static String converterTipoGoParaJava(String tipo) {
        switch (tipo) {
            case "string":
                return "String";
            case "int32":
                return "int";
            case "int64":
                return "long";
            case "bool":
                return "boolean";
            case "float64":
                return "double";
            case "float32":
                return "float";
            case "timeTime":
               return "ZonedDateTime";
        }
        return tipo;
    }

    private static String formatarCamelCase(String nome) {
        char c[] = nome.toCharArray();
        c[0] = Character.toLowerCase(c[0]);
        nome = new String(c);
        return nome;
    }

    public static List<String> findAllAttributes(final String input) {
        return PATTERN.matcher(input).results().map(MatchResult::group).collect(Collectors.toList());
    }
}
