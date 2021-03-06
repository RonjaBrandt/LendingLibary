package models;

public abstract class Material {

    private int id;
    private  String title;
    private String branch;
    private Customer borrower;

    public Material(int id, String title, String branch){
        this.id = id;
        this.title = title;
        this.branch = branch;
    }

    public String getTitle(){
        return title;
    }

    public int getId() {
        return id;
    }

    public void relocate(String newBranch){
        this.branch = newBranch;
    }

    public boolean lend(Customer customer){
        if(borrower==null){
            borrower=customer;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString(){
        return title;
    }

    @Override
    public boolean equals(Object obj){

        if(obj == null){
            return false;
        }


        if(getClass()==obj.getClass()){
            Material otherClass = (Material)obj;
            if (id == otherClass.id){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

    public abstract int getLoanPeriod();
        //must be overriden

}
