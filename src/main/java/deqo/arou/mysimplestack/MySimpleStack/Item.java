package deqo.arou.mysimplestack.MySimpleStack;

public class Item {
    private Object value;

    Item(Object value) {
        setValue(value);
    }

    /**
     * un commentaire répondant a l'exigence #1
     * @return
     */

    public Object getValue() {
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }
}
