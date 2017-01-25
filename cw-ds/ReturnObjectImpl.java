package com.damanjit;
public class ReturnObjectImpl implements ReturnObject {

    private ErrorMessage errorMessage=null;
    private Object object=null;

    public ReturnObjectImpl(Object object) {
        this.object=object;
    }

    public ReturnObjectImpl(ErrorMessage message) {
        errorMessage=message;
    }

    @Override
    public boolean hasError() {
        return (errorMessage!=null);
    }

    @Override
    public ErrorMessage getError() {
        if (hasError()){
            return errorMessage;
        }
        return errorMessage.NO_ERROR;
    }

    @Override
    public Object getReturnValue(){ // Return the object. If null is provided, load it with null and return it.
        return object;
    }

}
