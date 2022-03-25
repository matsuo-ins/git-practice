package extend.practice;

public class Slime extends Monster {
	public Slime(String name) {
		this.name = name;
		this.offensive = 8;
		this.hp = 100;
	}

	@Override
	public void attack(Living target) {
		int damage = offensive * Rand.get(10);
		System.out.printf("%sが体当たりで攻撃！%sに%dのダメージを与えた。%n", name, target.name, damage);
		target.hp -= damage;
	}
}