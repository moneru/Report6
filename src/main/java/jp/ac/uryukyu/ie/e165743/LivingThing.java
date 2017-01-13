package jp.ac.uryukyu.ie.e165743;
/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  *  int hitPoint; //敵のHP
 *  *  int attack; //敵の攻撃力
 *  *  boolean dead; //敵の生死状態。true=死亡。
 *  * Created by tnal on 2016/11/13.
 */
public class LivingThing { /**privateのPは大文字ではない*/
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;
    /**
     * * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * * @param name ヒーロー名
     * * @param maximumHP ヒーローのHP
     * * @param attack ヒーローの攻撃力
     */
    public LivingThing (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }
    /**
     * getterメソッドと同等。生死をboolean表現しているためメソッド名をisDead()とした。
     * @return boolean
     */
    public boolean isDead(){
        return  dead;
    }
    public String getName(){
        return name;
    }

    public int getHitPoint() { return hitPoint; }
    public int getAttack() { return attack; }
    public boolean getDead() { return dead; }
    public void setName( String name ) {
        this.name = name;
    }
    public void setDead( boolean dead) {
        this.dead = dead;
    }
    public void sethiPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }
    public void setAttack(int attack){
        this.attack = attack;
    }

    /**
     * * Enemyへ攻撃するメソッド。
     * * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * * @param e 攻撃対象
     */
    public void attack(LivingThing opponent) {
        if (dead == false) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }

    }
    /**
     * * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
    boolean getdead(){
        return dead;
    }
    public void setdead(boolean dead){
        this.dead = dead;
    }
    int gethitpoint(){
        return hitPoint;
    }
    public void setHitPoint(int HitPoint){
        this.hitPoint = HitPoint;
    }

}

