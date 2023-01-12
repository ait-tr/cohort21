public class WordTransformerAddSquareBrackets implements WordTransformer {
    public String transform(String str){
        return "["+str+"]";
    }
}
