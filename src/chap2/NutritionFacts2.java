package chap2;

public class NutritionFacts2 {
    //매개변수들은 기본값으로 초기화한다.
    private int servingSize = -1;
    private int servings = -1;
    private int calroies = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    /*
    세터 메서드들을 호출해서 원하는 매개변수의 값을 할당한다.
    점층적 생성자 패턴의 단점들을 보완한다.
     */

    public void setServingSize(int val) {
        this.servingSize = val;
    }

    public void setServings(int val) {
        this.servings = val;
    }

    public void setCalroies(int val) {
        this.calroies = val;
    }

    public void setFat(int val) {
        this.fat = val;
    }

    public void setSodium(int val) {
        this.sodium = val;
    }

    public void setCarbohydrate(int val) {
        this.carbohydrate = val;
    }
}
