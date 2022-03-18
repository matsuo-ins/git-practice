package extend.practice;

public class Oak extends Monster {
	public Oak(String name) {
		this.name = name;
		this.offensive = 12;
		this.hp = 200;
	}

	@Override
	public void attack(Living target) {
		int damage = offensive * Rand.get(10);
		System.out.printf("%sが槍で攻撃！%sに%dのダメージを与えた。%n", name, target.name, damage);
		target.hp -= damage;
	}
}