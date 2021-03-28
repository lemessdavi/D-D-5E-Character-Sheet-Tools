import Races.Race;

public class Character {
	private String nome;
	private Class<?> classe;
	private Race race;
	private int level;
	private String alinhamento;
	private String backgoround;
	private int armorClass;
	private int initiative;
	private int speed;
	private int strength;
	private int dexterity;
	private int constitution;
	
	
	
	
	public Character(String nome, Class classe) {
		
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setClasse(Class<?> classe) {
		this.classe = classe;
	}
	public Class<?> getClasse() {
		return classe;
	}
	public void setLevelTotal(int level) {
		this.level = level;
	}
	public int getLevel() {
		return level;
	}
	public void setAlinhamento(String alinhamento) {
		this.alinhamento = alinhamento;
	}
	public String getAlinhamento() {
		return alinhamento;
	}
}
