package www.reader.com.effectivejava01.id02chapters.two;

/**
 * @ClassName Test
 * @Description 创建实例
 * @Author yangkang
 * @Date 2019/9/26 14:43
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        /**
         * JavaBeans 模式，在这种模式中，
         * 调用一个无参的构造方法来创建对象，
         * 然后调用 setter 方法来设置每个必需的参数和可选参数
         * 缺点：冗长
         */
        NutritionFacts cocaCola  = new NutritionFacts();
        cocaCola.setServingSize(240);
        cocaCola.setServings(8);
        cocaCola.setCalories(100);
        cocaCola.setSodium(35);
        cocaCola.setCarbohydrate(27);

        /**
         * builder建造者模式
         */
        NutritionFactsFix cocaColaFix = new NutritionFactsFix.Builder(240, 8)
                .calories(100).sodium(35).carbohydrate(27).build();


    }
}
