public class Group {
    private int capacity=3;
    private Student[] array= new Student[capacity];
    private int size=0;

    public void add(Student student){
        if(size<array.length){
            array[size++]= student;
        }
    }

    public Group getStudentList(){
        Group resList= new Group();
        for (int i=0;i<size;i++){
            if(checkStudent(array[i])){
                resList.add(array[i]);
            }
        }
        return resList;
    }
    private boolean checkStudent(Student student){
        return student.getMissedClasses()>3;
    }

    public String toString(){
        String res="";
        for (int i = 0; i < size; i++) {
            res+=array[i]+ System.lineSeparator();
        }
        return res;
    }

    public Student getStudent(int index) {
        if(index<size && index>=0){
            return array[index];
        } else {
            return null;
        }
    }

    public Student getBestStudent(){
        Student best = array[0];
        for (int i = 0; i <size ; i++) {
            if(best.averageGrade()<array[i].averageGrade()){
                best=array[i];
            }
        }
        return best;
    }

}
