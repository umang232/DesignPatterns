public class ExtraCheese extends Decorator{

    BaseClass baseClass;
    public ExtraCheese(BaseClass baseClass){
        this.baseClass = baseClass;
    }
    @Override
    public int cost() {
        return baseClass.cost() + 10;
    }
}
