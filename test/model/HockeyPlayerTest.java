package model;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ramses
 */
public class HockeyPlayerTest {
    private static HockeyPlayer novoHockeyPlayer;
    
    public HockeyPlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        novoHockeyPlayer = new HockeyPlayer("Ana");	
    }
    
    @Test
    public void testGetPosition() {
        novoHockeyPlayer.setPosition("Goleiro");
        assertEquals("Goleiro", novoHockeyPlayer.getPosition());
    }

    @Test
    public void testGetAcceleration() {
        novoHockeyPlayer.setAcceleration(0.01);
        assertEquals(0.01, novoHockeyPlayer.getAcceleration(),0.01);
    }

    @Test
    public void testGetAggressiveness() {
        novoHockeyPlayer.setAggressiveness("alta");
        assertEquals("alta", novoHockeyPlayer.getAggressiveness());
    }

    @Test
    public void testGetAgility() {
        novoHockeyPlayer.setAgility("alta");
        assertEquals("alta", novoHockeyPlayer.getAgility());
    }

    @Test
    public void testGetBalance() {
        novoHockeyPlayer.setBalance("bom");
        assertEquals("bom", novoHockeyPlayer.getBalance());
    }

    @Test
    public void testGetBodyChecking() {
        novoHockeyPlayer.setBodyChecking("bom");
        assertEquals("bom", novoHockeyPlayer.getBodyChecking());
    }

    @Test
    public void testGetDefenseAwareness() {
        novoHockeyPlayer.setDefenseAwareness("bom");
        assertEquals("bom", novoHockeyPlayer.getDefenseAwareness());
    }

    @Test
    public void testGetDeking() {
        novoHockeyPlayer.setDeking("bom");
        assertEquals("bom", novoHockeyPlayer.getDeking());
    }

    @Test
    public void testGetEndurance() {
        novoHockeyPlayer.setEndurance("alta");
        assertEquals("alta", novoHockeyPlayer.getEndurance());
    }

    @Test
    public void testGetFaceOffs() {
        novoHockeyPlayer.setFaceOffs("bom");
        assertEquals("bom", novoHockeyPlayer.getFaceOffs());
    }

    @Test
    public void testGetHandEye() {
        novoHockeyPlayer.setHandEye("bom");
        assertEquals("bom", novoHockeyPlayer.getHandEye());
    }

    @Test
    public void testGetOffenseAwareness() {
        novoHockeyPlayer.setOffenseAwareness("bom");
        assertEquals("bom", novoHockeyPlayer.getOffenseAwareness());
    }

    @Test
    public void testGetPassing() {
        novoHockeyPlayer.setPassing("bom");
        assertEquals("bom", novoHockeyPlayer.getPassing());
    }

    @Test
    public void testGetPotential() {
        novoHockeyPlayer.setPotential("bom");
        assertEquals("bom", novoHockeyPlayer.getPotential());
    }

    @Test
    public void testGetPuckControl() {
        novoHockeyPlayer.setPuckControl("bom");
        assertEquals("bom", novoHockeyPlayer.getPuckControl());
    }

    @Test
    public void testGetShotBlocking() {
        novoHockeyPlayer.setShotBlocking("excelente");
        assertEquals("excelente", novoHockeyPlayer.getShotBlocking());
    }

    @Test
    public void testGetSlapShotAccuracy() {
        novoHockeyPlayer.setSlapShotAccuracy("bom");
        assertEquals("bom", novoHockeyPlayer.getSlapShotAccuracy());
    }

    @Test
    public void testGetSlapShotPower() {
        novoHockeyPlayer.setSlapShotPower("bom");
        assertEquals("bom", novoHockeyPlayer.getSlapShotPower());
    }

    @Test
    public void testGetWristShotAccuracy() {
        novoHockeyPlayer.setWristShotAccuracy("bom");
        assertEquals("bom", novoHockeyPlayer.getWristShotAccuracy());
    }

    @Test
    public void testGetWristShotPower() {
        novoHockeyPlayer.setWristShotPower("bom");
        assertEquals("bom", novoHockeyPlayer.getWristShotPower());
    }

    @Test
    public void testGetSpeed() {
        novoHockeyPlayer.setSpeed(20.5);
        assertEquals(20.5, novoHockeyPlayer.getSpeed(), 0.01);
    }

    @Test
    public void testGetStickChecking() {
        novoHockeyPlayer.setStickChecking("bom");
        assertEquals("bom", novoHockeyPlayer.getStickChecking());
    }

    @Test
    public void testGetStrength() {
        novoHockeyPlayer.setStrength("boa");
        assertEquals("boa", novoHockeyPlayer.getStrength());
    }
}