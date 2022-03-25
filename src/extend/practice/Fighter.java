package extend.practice;

public class Fighter extends Human {
	public Fighter(String name) {
		this.name = name;
		this.offensive = 20;
		this.hp = 270;
	}

	@Override
	public void attack(Living target) {
		int damage = offensive * Rand.get(10);
		System.out.printf("%sが斧で攻撃！%sに%dのダメージを与えた。%n", name, target.name, damage);
		target.hp -= damage;
	}
}