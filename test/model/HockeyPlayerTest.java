/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import model.HockeyPlayer;

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
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPosition method, of class HockeyPlayer.
     */
    @Test
    public void testGetPosition() {
        System.out.println("getPosition");
        String expResult = null;
        String result = novoHockeyPlayer.getPosition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPosition method, of class HockeyPlayer.
     */
    @Test
    public void testSetPosition() {
        System.out.println("setPosition");
        String position = "null";
        novoHockeyPlayer.setPosition(position);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getAcceleration method, of class HockeyPlayer.
     */
    @Test
    public void testGetAcceleration() {
        System.out.println("getAcceleration");
        Double expResult = 0.00;
        Double result = novoHockeyPlayer.getAcceleration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setAcceleration method, of class HockeyPlayer.
     */
    @Test
    public void testSetAcceleration() {
        System.out.println("setAcceleration");
        Double acceleration = 0.00;
        novoHockeyPlayer.setAcceleration(acceleration);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getAggressiveness method, of class HockeyPlayer.
     */
    @Test
    public void testGetAggressiveness() {
        System.out.println("getAggressiveness");
        String expResult = null;
        String result = novoHockeyPlayer.getAggressiveness();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setAggressiveness method, of class HockeyPlayer.
     */
    @Test
    public void testSetAggressiveness() {
        System.out.println("setAggressiveness");
        String aggressiveness = "null";
        novoHockeyPlayer.setAggressiveness(aggressiveness);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getAgility method, of class HockeyPlayer.
     */
    @Test
    public void testGetAgility() {
        System.out.println("getAgility");
        String expResult = null;
        String result = novoHockeyPlayer.getAgility();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setAgility method, of class HockeyPlayer.
     */
    @Test
    public void testSetAgility() {
        System.out.println("setAgility");
        String agility = "null";
        novoHockeyPlayer.setAgility(agility);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getBalance method, of class HockeyPlayer.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        String expResult = null;
        String result = novoHockeyPlayer.getBalance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setBalance method, of class HockeyPlayer.
     */
    @Test
    public void testSetBalance() {
        System.out.println("setBalance");
        String balance = "null";
        novoHockeyPlayer.setBalance(balance);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getBodyChecking method, of class HockeyPlayer.
     */
    @Test
    public void testGetBodyChecking() {
        System.out.println("getBodyChecking");
        String expResult = null;
        String result = novoHockeyPlayer.getBodyChecking();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setBodyChecking method, of class HockeyPlayer.
     */
    @Test
    public void testSetBodyChecking() {
        System.out.println("setBodyChecking");
        String bodyChecking = "null";
        novoHockeyPlayer.setBodyChecking(bodyChecking);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDefenseAwareness method, of class HockeyPlayer.
     */
    @Test
    public void testGetDefenseAwareness() {
        System.out.println("getDefenseAwareness");
        String expResult = null;
        String result = novoHockeyPlayer.getDefenseAwareness();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDefenseAwareness method, of class HockeyPlayer.
     */
    @Test
    public void testSetDefenseAwareness() {
        System.out.println("setDefenseAwareness");
        String defenseAwareness = "";
        novoHockeyPlayer.setDefenseAwareness(defenseAwareness);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDeking method, of class HockeyPlayer.
     */
    @Test
    public void testGetDeking() {
        System.out.println("getDeking");
        String expResult = null;
        String result = novoHockeyPlayer.getDeking();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDeking method, of class HockeyPlayer.
     */
    @Test
    public void testSetDeking() {
        System.out.println("setDeking");
        String deking = "null";
        novoHockeyPlayer.setDeking(deking);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getEndurance method, of class HockeyPlayer.
     */
    @Test
    public void testGetEndurance() {
        System.out.println("getEndurance");
        String expResult = null;
        String result = novoHockeyPlayer.getEndurance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setEndurance method, of class HockeyPlayer.
     */
    @Test
    public void testSetEndurance() {
        System.out.println("setEndurance");
        String endurance = "null";
        novoHockeyPlayer.setEndurance(endurance);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getFaceOffs method, of class HockeyPlayer.
     */
    @Test
    public void testGetFaceOffs() {
        System.out.println("getFaceOffs");
        String expResult = null;
        String result = novoHockeyPlayer.getFaceOffs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setFaceOffs method, of class HockeyPlayer.
     */
    @Test
    public void testSetFaceOffs() {
        System.out.println("setFaceOffs");
        String faceOffs = "null";
        novoHockeyPlayer.setFaceOffs(faceOffs);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getHandEye method, of class HockeyPlayer.
     */
    @Test
    public void testGetHandEye() {
        System.out.println("getHandEye");
        String expResult = null;
        String result = novoHockeyPlayer.getHandEye();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setHandEye method, of class HockeyPlayer.
     */
    @Test
    public void testSetHandEye() {
        System.out.println("setHandEye");
        String handEye = "null";
        novoHockeyPlayer.setHandEye(handEye);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getOffenseAwareness method, of class HockeyPlayer.
     */
    @Test
    public void testGetOffenseAwareness() {
        System.out.println("getOffenseAwareness");
        String expResult = null;
        String result = novoHockeyPlayer.getOffenseAwareness();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setOffenseAwareness method, of class HockeyPlayer.
     */
    @Test
    public void testSetOffenseAwareness() {
        System.out.println("setOffenseAwareness");
        String offenseAwareness = "null";
        novoHockeyPlayer.setOffenseAwareness(offenseAwareness);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPassing method, of class HockeyPlayer.
     */
    @Test
    public void testGetPassing() {
        System.out.println("getPassing");
        String expResult = null;
        String result = novoHockeyPlayer.getPassing();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPassing method, of class HockeyPlayer.
     */
    @Test
    public void testSetPassing() {
        System.out.println("setPassing");
        String passing = "null";
        novoHockeyPlayer.setPassing(passing);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPotential method, of class HockeyPlayer.
     */
    @Test
    public void testGetPotential() {
        System.out.println("getPotential");
        String expResult = null;
        String result = novoHockeyPlayer.getPotential();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPotential method, of class HockeyPlayer.
     */
    @Test
    public void testSetPotential() {
        System.out.println("setPotential");
        String potential = "null";
        novoHockeyPlayer.setPotential(potential);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPuckControl method, of class HockeyPlayer.
     */
    @Test
    public void testGetPuckControl() {
        System.out.println("getPuckControl");
        String expResult = null;
        String result = novoHockeyPlayer.getPuckControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
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