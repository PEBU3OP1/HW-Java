/**
 * Actions
 */

 //ударить
 // получить повреждения
 //вернуть статус
 //переместиться
 // вернуть состояние

public interface Actions {

    float hit();
    float get_Hit(float damage);
    boolean status();
    boolean changePos();
    String condition();
    String step();
    


    
}