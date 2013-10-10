/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
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

    /**
     * Test of setPuckControl method, of class HockeyPlayer.
     */
    @Test
    public void testSetPuckControl() {
        System.out.println("setPuckControl");
        String puckControl = "null";
        novoHockeyPlayer.setPuckControl(puckControl);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getShotBlocking method, of class HockeyPlayer.
     */
    @Test
    public void testGetShotBlocking() {
        System.out.println("getShotBlocking");
        String expResult = null;
        String result = novoHockeyPlayer.getShotBlocking();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setShotBlocking method, of class HockeyPlayer.
     */
    @Test
    public void testSetShotBlocking() {
        System.out.println("setShotBlocking");
        String shotBlocking = "null";
        novoHockeyPlayer.setShotBlocking(shotBlocking);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getSlapShotAccuracy method, of class HockeyPlayer.
     */
    @Test
    public void testGetSlapShotAccuracy() {
        System.out.println("getSlapShotAccuracy");
        String expResult = null;
        String result = novoHockeyPlayer.getSlapShotAccuracy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setSlapShotAccuracy method, of class HockeyPlayer.
     */
    @Test
    public void testSetSlapShotAccuracy() {
        System.out.println("setSlapShotAccuracy");
        String slapShotAccuracy = "null";
        novoHockeyPlayer.setSlapShotAccuracy(slapShotAccuracy);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getSlapShotPower method, of class HockeyPlayer.
     */
    @Test
    public void testGetSlapShotPower() {
        System.out.println("getSlapShotPower");
        String expResult = null;
        String result = novoHockeyPlayer.getSlapShotPower();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setSlapShotPower method, of class HockeyPlayer.
     */
    @Test
    public void testSetSlapShotPower() {
        System.out.println("setSlapShotPower");
        String slapShotPower = "null";
        novoHockeyPlayer.setSlapShotPower(slapShotPower);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getWristShotAccuracy method, of class HockeyPlayer.
     */
    @Test
    public void testGetWristShotAccuracy() {
        System.out.println("getWristShotAccuracy");
        String expResult = null;
        String result = novoHockeyPlayer.getWristShotAccuracy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setWristShotAccuracy method, of class HockeyPlayer.
     */
    @Test
    public void testSetWristShotAccuracy() {
        System.out.println("setWristShotAccuracy");
        String wristShotAccuracy = "null";
        novoHockeyPlayer.setWristShotAccuracy(wristShotAccuracy);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getWristShotPower method, of class HockeyPlayer.
     */
    @Test
    public void testGetWristShotPower() {
        System.out.println("getWristShotPower");
        String expResult = null;
        String result = novoHockeyPlayer.getWristShotPower();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setWristShotPower method, of class HockeyPlayer.
     */
    @Test
    public void testSetWristShotPower() {
        System.out.println("setWristShotPower");
        String wristShotPower = "null";
        novoHockeyPlayer.setWristShotPower(wristShotPower);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getSpeed method, of class HockeyPlayer.
     */
    @Test
    public void testGetSpeed() {
        System.out.println("getSpeed");
        Double expResult = 0.00;
        Double result = novoHockeyPlayer.getSpeed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setSpeed method, of class HockeyPlayer.
     */
    @Test
    public void testSetSpeed() {
        System.out.println("setSpeed");
        Double speed = 0.00;
        novoHockeyPlayer.setSpeed(speed);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getStickChecking method, of class HockeyPlayer.
     */
    @Test
    public void testGetStickChecking() {
        System.out.println("getStickChecking");
        String expResult = null;
        String result = novoHockeyPlayer.getStickChecking();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setStickChecking method, of class HockeyPlayer.
     */
    @Test
    public void testSetStickChecking() {
        System.out.println("setStickChecking");
        String stickChecking = "null";
        novoHockeyPlayer.setStickChecking(stickChecking);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getStrength method, of class HockeyPlayer.
     */
    @Test
    public void testGetStrength() {
        System.out.println("getStrength");
        String expResult = null;
        String result = novoHockeyPlayer.getStrength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setStrength method, of class HockeyPlayer.
     */
    @Test
    public void testSetStrength() {
        System.out.println("setStrength");
        String strength = "null";
        novoHockeyPlayer.setStrength(strength);
        // TODO review the generated test code and remove the default call to fail.
    }
}