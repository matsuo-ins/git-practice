package extend.practice;

public class Brave extends Human {
	public Brave(String name) {
		this.name = "勇者";
		this.offensive = 10;
		this.hp = 200;
	}

	@Override
	public void attack(Living target) {
		int damage = offensive * Rand.get(10);
		//勇者が剣で攻撃！オークに80のダメージを与えた。
		//%s  が剣で攻撃！%s    にdamageのダメージを与えた。
		System.out.printf("%sが剣で攻撃！%sに%dのダメージを与えた。%n", name, target.name, damage);
		target.hp -= damage;
	}
}
