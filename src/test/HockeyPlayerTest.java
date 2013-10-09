

import static java.org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

import controleatleta.HockeyPlayer;

public class HockeyPlayerTest {

	HockeyPlayer novoHockeyPlayer;
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	@Before
	public void setUp() throws Exception {
		novoHockeyPlayer = new HockeyPlayer("Ana");		
	}

	@Test
	public void getNomeTest() {
		assertEquals("Ana", novoHockeyPlayer.getNome());
	}
	
	@Test
	public void getAlturaTest() {
		novoHockeyPlayer.setAltura(1.70);
		assertEquals(1.70, novoHockeyPlayer.getAltura(),0.01);
	}
	
	@Test
	public void getPesoTest() {
		novoHockeyPlayer.setPeso(50.70);
		assertEquals(50.70, novoHockeyPlayer.getPeso(),0.01);
	}
	
	@Test
	public void getSexoTest() {
		novoHockeyPlayer.setSexo("masculino");
		assertEquals("masculino", novoHockeyPlayer.getSexo());
	}
	
	@Test
	public void getNomePaiTest() {
		novoHockeyPlayer.setNomePai("Ramses");
		assertEquals("Ramses", novoHockeyPlayer.getNomePai());
	}
	
	@Test
	public void getNomeMaeTest() {
		novoHockeyPlayer.setNomeMae("Maria");
		assertEquals("Maria", novoHockeyPlayer.getNomeMae());
	}
	
	@Test
	public void getRgTest() {
		novoHockeyPlayer.setRg("123");
		assertEquals("123", novoHockeyPlayer.getRg());
	}
	
	@Test
	public void getCpfTest() {
		novoHockeyPlayer.setCpf("134");
		assertEquals("134", novoHockeyPlayer.getCpf());
	}
	
//	@Test
//	public void getTelefonesTest() {
//		ArrayList<String> telefones;
//		telefones = new ArrayList<String>();
//		telefones.add("545454");
//		for (String t : novoHockeyPlayer.getTelefones()) {
//        	assertEquals("545454", t);
//        }
//		
//	}
	
	@Test
	public void getLogradouroTest() {
		novoHockeyPlayer.getEndereco().setLogradouro("rua 9");
		assertEquals("rua 9", novoHockeyPlayer.getEndereco().getLogradouro());
	}
	
	@Test
	public void getNumeroTest() {
		novoHockeyPlayer.getEndereco().setNumero("404");
		assertEquals("404", novoHockeyPlayer.getEndereco().getNumero());
	}
	
	@Test
	public void getComplementoTest() {
		novoHockeyPlayer.getEndereco().setComplemento("residencia lala");
		assertEquals("residencia lala", novoHockeyPlayer.getEndereco().getComplemento());
	}
	
	@Test
	public void getBairroTest() {
		novoHockeyPlayer.getEndereco().setBairro("taguatinga");
		assertEquals("taguatinga", novoHockeyPlayer.getEndereco().getBairro());
	}
	
	@Test
	public void getCidadeTest() {
		novoHockeyPlayer.getEndereco().setCidade("Brasilia");
		assertEquals("Brasilia", novoHockeyPlayer.getEndereco().getCidade());
	}
	
	@Test
	public void getEstadoTest() {
		novoHockeyPlayer.getEndereco().setEstado("DF");
		assertEquals("DF", novoHockeyPlayer.getEndereco().getEstado());
	}
	
	@Test
	public void getPaisTest() {
		novoHockeyPlayer.getEndereco().setPais("Brasil");
		assertEquals("Brasil", novoHockeyPlayer.getEndereco().getPais());
	}
	
	@Test
	public void getCepTest() {
		novoHockeyPlayer.getEndereco().setCep("874545");
		assertEquals("874545", novoHockeyPlayer.getEndereco().getCep());
	}
	
	@Test
	public void getAccelerationTest() {
		novoHockeyPlayer.setAcceleration(5.22);
		assertEquals(5.22, novoHockeyPlayer.getAcceleration(),0.01);
	}
	
	@Test
	public void getPositionTest() {
		novoHockeyPlayer.setPosition("Centro");
		assertEquals("Centro", novoHockeyPlayer.getPosition());
	}
	
	@Test
	public void getAggressivenessTest() {
		novoHockeyPlayer.setAggressiveness(5);
		assertEquals(5, novoHockeyPlayer.getAggressiveness());
	}
	
	@Test
	public void getAgilityTest() {
		novoHockeyPlayer.setAgility(5);
		assertEquals(5, novoHockeyPlayer.getAgility());
	}
	
	@Test
	public void getBalanceTest() {
		novoHockeyPlayer.setBalance(5);
		assertEquals(5, novoHockeyPlayer.getBalance());
	}
	
	@Test
	public void getBodyCheckingTest() {
		novoHockeyPlayer.setBodyChecking(5);
		assertEquals(5, novoHockeyPlayer.getBodyChecking());
	}
	
	@Test
	public void getDefenseAwarenessTest() {
		novoHockeyPlayer.setDefenseAwareness(5);
		assertEquals(5, novoHockeyPlayer.getDefenseAwareness());
	}
	
	@Test
	public void getDekingTest() {
		novoHockeyPlayer.setDeking(5);
		assertEquals(5, novoHockeyPlayer.getDeking());
	}
	
	@Test
	public void getEnduranceTest() {
		novoHockeyPlayer.setEndurance(5);
		assertEquals(5, novoHockeyPlayer.getEndurance());
	}
	
	@Test
	public void getFaceOffsTest() {
		novoHockeyPlayer.setFaceOffs(5);
		assertEquals(5, novoHockeyPlayer.getFaceOffs());
	}
	
	@Test
	public void getHandEyeTest() {
		novoHockeyPlayer.setHandEye(5);
		assertEquals(5, novoHockeyPlayer.getHandEye());
	}
	
	@Test
	public void getOffenseAwarenessTest() {
		novoHockeyPlayer.setOffenseAwareness(5);
		assertEquals(5, novoHockeyPlayer.getOffenseAwareness());
	}
	
	@Test
	public void getPassingTest() {
		novoHockeyPlayer.setPassing(5);
		assertEquals(5, novoHockeyPlayer.getPassing());
	}
	
	@Test
	public void getPuckControlTest() {
		novoHockeyPlayer.setPuckControl(5);
		assertEquals(5, novoHockeyPlayer.getPuckControl());
	}
	
	@Test
	public void getPotentialTest() {
		novoHockeyPlayer.setPotential(5);
		assertEquals(5, novoHockeyPlayer.getPotential());
	}
	
	@Test
	public void getShotBlockingTest() {
		novoHockeyPlayer.setShotBlocking(5);
		assertEquals(5, novoHockeyPlayer.getShotBlocking());
	}
	
	@Test
	public void getSlapShotAccuracyTest() {
		novoHockeyPlayer.setSlapShotAccuracy(5);
		assertEquals(5, novoHockeyPlayer.getSlapShotAccuracy());
	}
	
	@Test
	public void getSlapShotPowerTest() {
		novoHockeyPlayer.setSlapShotPower(5);
		assertEquals(5, novoHockeyPlayer.getSlapShotPower());
	}
	
	@Test
	public void getWristShotAccuracyTest() {
		novoHockeyPlayer.setWristShotAccuracy(5);
		assertEquals(5, novoHockeyPlayer.getWristShotAccuracy());
	}
	
	@Test
	public void getWristShotPowerTest() {
		novoHockeyPlayer.setWristShotPower(5);
		assertEquals(5, novoHockeyPlayer.getWristShotPower());
	}
	
	@Test
	public void getSpeedTest() {
		novoHockeyPlayer.setSpeed(15.55);
		assertEquals(15.55, novoHockeyPlayer.getSpeed(),0.01);
	}
	
	@Test
	public void getOverAllTest() {
		novoHockeyPlayer.setOverAll(15.55);
		assertEquals(15.55, novoHockeyPlayer.getOverAll(),0.01);
	}
	
	@Test
	public void getStickCheckingTest() {
		novoHockeyPlayer.setStickChecking(5);
		assertEquals(5, novoHockeyPlayer.getStickChecking());
	}
	
	@Test
	public void getStrengthTest() {
		novoHockeyPlayer.setStrength(5);
		assertEquals(5, novoHockeyPlayer.getStrength());
	}
}
