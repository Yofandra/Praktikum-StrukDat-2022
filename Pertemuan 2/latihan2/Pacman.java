public class Pacman {
    int x, y, width, height;

    void moveLeft(){
        if(x>0){
            x -= 1;
        }else{
            System.out.println("status : PacMan melebihi batas");
        }
    }
    void moveRight(){
        if(x<=width){
            x += 1;
        }else {
            System.out.println("status : PacMan melebihi batas");
        }
    }
    void moveUp(){
        if(y<= height){
            y += 1;
        }else{
            System.out.println("status : PacMan melebihi batas");
        }
    }
    void moveDown(){
        if(y>0){
            y -= 1;
        }else{
            System.out.println("status : PacMan melebihi batas");
        }
    }
    void printPosition(){
        System.out.println("koordinat Pac Man = "+x + "," +y);
        System.out.println("Lebar Arena = "+height*width);
    }
}
