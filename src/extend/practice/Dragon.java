package extend.practice;

public class Dragon extends Monster {
	public Dragon(String name) {
		this.name = name;
		this.offensive = 15;
		this.hp = 300;
	}

	@Override
	public void attack(Living target) {
		int damage = offensive * Rand.get(10);
		System.out.printf("%sが炎で攻撃！%sに%dのダメージを与えた。%n", name, target.name, damage);
		target.hp -= damage;
	}
}