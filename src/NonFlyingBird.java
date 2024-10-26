abstract class NonFlyingBird extends Bird {
    // fix class declaration

    //override toString method by returning a string with the class name
    @Override
    public String toString(){
        return "Class name " + getClass().getSimpleName();
    }
}

