class Coding{

  void writingCode(){
    System.out.println("I love coding");
  }
}

class Programming extends Coding{

  void writingCode(){
    System.out.println("I love Programming");
  }
}

class Practice4{
  public static void main(String[] args){
    Programming codeWriter = new Programming();

    codeWriter.writingCode();

  }
}