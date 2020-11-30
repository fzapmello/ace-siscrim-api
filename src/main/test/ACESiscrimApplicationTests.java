import br.gov.pf.ditec.siscrim.rotas.MaterialRotas;
import br.gov.pf.ditec.siscrim.servicos.MaterialService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@ContextConfiguration(classes={br.gov.pf.ditec.siscrim.ACESiscrimApplication.class})
@TestPropertySource(locations="classpath:siscrim.yml")
class ACESiscrimApplicationTests {


	private static final Long COD_MATERIAL = 1L;

	@Autowired
	private MockMvc mvc;

	@Autowired
	protected MaterialRotas materialRotas;

	@Test
	public void obterMaterialTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get(materialRotas.getMaterial(), COD_MATERIAL).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
//				.andExpect(content().string());
	}
}
