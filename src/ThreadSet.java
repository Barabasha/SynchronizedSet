public class ThreadSet implements Runnable{
    private String str;
    private Resource resourceObj = new Resource(str);

    ThreadSet(Resource resourceObj) {
        this.resourceObj = resourceObj;
    }

    @Override
    public void run() {
        resourceObj.stringToSet(resourceObj.str);
    }
}
