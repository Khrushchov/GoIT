package goit.gojavaonline2.enterprise.module2;

public class LongTask implements Task<Long> {
    private long value;

    public LongTask(long value) {
        this.value = value;
    }

    @Override
    public void execute(){
    }
    @Override
    public Long getResult() {
        return getValue();
    }



    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }
}
