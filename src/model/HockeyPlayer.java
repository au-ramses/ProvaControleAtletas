package model;

public class HockeyPlayer extends Atleta {
	private String position; //Posição do Jogador 
	private double acceleration; //Aceleração
	private String aggressiveness; //Grau de agressividade
	private String agility; //Grau de agilidade
	private String balance; //Nivel de equilíbrio
	private String bodyChecking; //Nivel de marcação (defesa)
	private String defenseAwareness; //Nivel de visão de defesa
	private String deking; //Nivel de drible do jogador
	private String endurance; // Resistência do jogador
	private String faceOffs; //Habilidade nos face offs
	private String handEye; //Visão de passe
	private String offenseAwareness; //Visão de ataque
	private String passing; //Habilidade nos passes
	private String potential; //Potencial do jogador
	private String puckControl; //Controle do puck
	private String shotBlocking; //Bloqueio de chutes
	private String slapShotAccuracy; //Precisão no chute do tipo slap shot
	private String slapShotPower; // Força no chute do tipo slap shot
	private String wristShotAccuracy; //Precisão no chute do tipo wrist shot
	private String wristShotPower; // Força no chute do tipo wrist shot
	private double speed; // Velocidade
	private String stickChecking; // Defesa com o taco (roubar o puck com o taco)
	private String strength; // Força física do jogador
	
	public HockeyPlayer(String nome) {
		super(nome);
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Double getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(Double acceleration) {
		this.acceleration = acceleration;
	}

	public String getAggressiveness() {
		return aggressiveness;
	}

	public void setAggressiveness(String aggressiveness) {
		this.aggressiveness = aggressiveness;
	}

	public String getAgility() {
		return agility;
	}

	public void setAgility(String agility) {
		this.agility = agility;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getBodyChecking() {
		return bodyChecking;
	}

	public void setBodyChecking(String bodyChecking) {
		this.bodyChecking = bodyChecking;
	}

	public String getDefenseAwareness() {
		return defenseAwareness;
	}

	public void setDefenseAwareness(String defenseAwareness) {
		this.defenseAwareness = defenseAwareness;
	}

	public String getDeking() {
		return deking;
	}

	public void setDeking(String deking) {
		this.deking = deking;
	}

	public String getEndurance() {
		return endurance;
	}

	public void setEndurance(String endurance) {
		this.endurance = endurance;
	}

	public String getFaceOffs() {
		return faceOffs;
	}

	public void setFaceOffs(String faceOffs) {
		this.faceOffs = faceOffs;
	}

	public String getHandEye() {
		return handEye;
	}

	public void setHandEye(String handEye) {
		this.handEye = handEye;
	}

	public String getOffenseAwareness() {
		return offenseAwareness;
	}

	public void setOffenseAwareness(String offenseAwareness) {
		this.offenseAwareness = offenseAwareness;
	}

	public String getPassing() {
		return passing;
	}

	public void setPassing(String passing) {
		this.passing = passing;
	}

	public String getPotential() {
		return potential;
	}

	public void setPotential(String potential) {
		this.potential = potential;
	}

	public String getPuckControl() {
		return puckControl;
	}

	public void setPuckControl(String puckControl) {
		this.puckControl = puckControl;
	}

	public String getShotBlocking() {
		return shotBlocking;
	}

	public void setShotBlocking(String shotBlocking) {
		this.shotBlocking = shotBlocking;
	}

	public String getSlapShotAccuracy() {
		return slapShotAccuracy;
	}

	public void setSlapShotAccuracy(String slapShotAccuracy) {
		this.slapShotAccuracy = slapShotAccuracy;
	}

	public String getSlapShotPower() {
		return slapShotPower;
	}

	public void setSlapShotPower(String slapShotPower) {
		this.slapShotPower = slapShotPower;
	}

	public String getWristShotAccuracy() {
		return wristShotAccuracy;
	}

	public void setWristShotAccuracy(String wristShotAccuracy) {
		this.wristShotAccuracy = wristShotAccuracy;
	}

	public String getWristShotPower() {
		return wristShotPower;
	}

	public void setWristShotPower(String wristShotPower) {
		this.wristShotPower = wristShotPower;
	}

	public Double getSpeed() {
		return speed;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	public String getStickChecking() {
		return stickChecking;
	}

	public void setStickChecking(String stickChecking) {
		this.stickChecking = stickChecking;
	}

	public String getStrength() {
		return strength;
	}

	public void setStrength(String strength) {
		this.strength = strength;
	}
}
