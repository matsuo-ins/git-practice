package extend.practice;

public abstract class Living {
	protected String name; // キャラクターの名前
	protected int hp; // ヒットポイント
	protected int offensive; // 攻撃力

	abstract void attack(Living target); // ターゲットに攻撃するメソッド

//	public void takeDamage(int damage) { // 攻撃を受けるメソッド
//		hp -= damage;
//	}
//
//	public boolean isDead() { // 倒れたか判定するメソッド
//		return hp <= 0;
//	}
}