package br.com.contmatic.empresa;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EnderecoTest {

	@BeforeClass
	public static void before() {
		System.out.println("Iniciando os testes");
	}

	@AfterClass
	public static void after() {
		System.out.println(" Terminando os testes");
	}

	@Test
	public void deve_testar_cep() {
		Endereco endereco = new Endereco();
		endereco.setCep("03308050");
		assertEquals("03308050", endereco.getCep());

	}

	@Test
	public void deve_testar_cidade() {
		Endereco endereco = new Endereco();
		endereco.setCidade("Sao Paulo");
		assertEquals("Sao Paulo", endereco.getCidade());
	}

	@Test
	public void deve_testar_rua() {
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua");
		assertEquals("Rua", endereco.getLogradouro());

	}

	@Test
	public void deve_testar_numero() {
		Endereco endereco = new Endereco();
		endereco.setNumero(368);
		assertEquals(368, endereco.getNumero());
	}

	@Test
	public void deve_testar_pais() {
		Endereco endereco = new Endereco();
		endereco.setPais("Brasil");
		assertEquals("Brasil", endereco.getPais());

	}

	@Test
	public void deve_testar_cep_iguais() {
		Endereco endereco = new Endereco();
		endereco.setCep("09340070");
		Endereco endereco2 = new Endereco();
		endereco2.setCep("09340070");
		assertEquals(endereco, endereco2);

	}

	@Test
	public void deve_testar_cep_diferentes() {
		Endereco endereco = new Endereco();
		endereco.setCep("09340070");
		Endereco endereco2 = new Endereco();
		endereco2.setCep("09350070");
		assertNotEquals(endereco, endereco2);
	}

	@Test
	public void deve_testar_endereco_e_funcionario() {
		Endereco endereco = new Endereco();
		endereco.setCep("09340070");
		Funcionario funcionario = new Funcionario();
		assertNotEquals(endereco, funcionario);

	}

	@Test
	public void testar_tostring() {
		Endereco endereco = new Endereco();
		endereco.setCep("09340070");
		assertNotEquals("09340070", endereco.toString());
	}

	@Test
	public void testar_doisobjetos() {
		Endereco endereco = new Endereco();
		Endereco endereco1 = endereco;
		assertEquals(endereco, endereco1);
	}

	@Test
	public void testar_null() {
		Endereco endereco = new Endereco();
		Endereco endereco1 = null;
		assertNotEquals(endereco, endereco1);
	}

	@Test
	public void nao_deve_retornar_tostring_nulo() {
		Endereco endereco = new Endereco();
		assertNotEquals(endereco.toString(), null);
	}

	@Test(expected = NullPointerException.class)
	public void deve_testar_cep2() {
		Endereco endereco = new Endereco();
		endereco.setCep(null);
		Endereco endereco2 = new Endereco();
		endereco2.setCep("09340070");
		assertNotEquals(endereco, endereco2);

	}

	@Test(expected = NullPointerException.class)
	public void deve_testar_numero2() {
		Endereco endereco = new Endereco();
		endereco.setNumero(null);
		Endereco endereco2 = new Endereco();
		endereco2.setNumero(368);
		assertThat(endereco.equals(endereco2), is(false));
		assertFalse(endereco.hashCode() == endereco2.hashCode());

	}

	@Test
	public void deve_testar_numeros_diferentes() {
		Endereco endereco = new Endereco();
		endereco.setNumero(567);
		Endereco endereco2 = new Endereco();
		endereco2.setNumero(369);
		assertNotEquals(endereco.getNumero(), endereco2.getNumero());

	}

}
