import javax.swing.JFrame;
public class Snakeframe extends JFrame{

        public Snakeframe(){
        this.add(new Snakepanel());
        this.setTitle("Snake");
        this.setResizable(false);
        this.setVisible(true);
        this.pack();

    }


}
