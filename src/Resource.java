import java.util.Collections;
import java.util.TreeSet;

class Resource {
    private TreeSet<String> set = new TreeSet<>();
    String str;

    Resource(String str){
        this.str = str;
    }

    void stringToSet(String str){
        Collections.addAll(set, str.split(" "));
    }

    TreeSet<String> getSet() {
        return set;
    }

    int getSize(){
        return set.size();
    }
}
