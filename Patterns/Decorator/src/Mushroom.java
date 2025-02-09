public class Mushroom extends Decorator{
    BaseClass baseClass;
    Mushroom(BaseClass baseClass){
        this.baseClass = baseClass;
    }
    @Override
    public int cost() {
        return baseClass.cost() + 15;
    }
}
