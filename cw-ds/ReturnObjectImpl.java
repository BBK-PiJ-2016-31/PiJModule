
public class ReturnObjectImpl implements ReturnObject {

    private ErrorMessage errorMessage=null;
    private Object object=null;

    /**
    *Default constructors to decide how the object will be wrapped in.
    * Will be a object with value OR an object with ErrorMesage
    */
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
