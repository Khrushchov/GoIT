package goit.gojavaonline2.enterprise.module2;

public class IntegerTask implements Task<Integer> {
    private Integer value;

    public IntegerTask(Integer value) {
        this.value = value;
    }

    @Override
    public void execute() {
    }

    @Override
    public Integer getResult() {
        return value;
    }


}

