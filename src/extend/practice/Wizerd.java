package extend.practice;

public class Wizerd extends Human {
	public Wizerd(String name) {
		this.name = name;
		this.offensive = 15;
		this.hp = 150;
	}

	@Override
	public void attack(Living target) {
		int damage = offensive * Rand.get(10);
		System.out.printf("%sが魔法で攻撃！%sに%dのダメージを与えた。%n", name, target.name, damage);
		target.hp -= damage;
	}
}
