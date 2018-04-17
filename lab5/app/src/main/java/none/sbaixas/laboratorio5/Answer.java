package none.sbaixas.laboratorio5;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import static android.arch.persistence.room.ForeignKey.CASCADE;

/**
 * Created by Sebastian on 17-04-18.
 */

@Entity(foreignKeys = @ForeignKey(entity = Question.class,
        parentColumns = "questionId",
        childColumns = "questionId",
        onDelete = CASCADE))

public class Answer {
    @NonNull
    @PrimaryKey(autoGenerate = true)
    private int answerId;
    private int questionId;
    private String answerText;
    public Answer(){

    }
    public int getAnswerId(){
        return this.answerId;
    }
    public int getQuestionId(){
        return this.questionId;
    }
    public String getAnswerText(){
        return this.answerText;
    }
    public void setAnswerId(int answerId){
        this.answerId = answerId;
    }
    public void setQuestionId(int questionId){
        this.questionId = questionId;
    }
    public void setAnswerText(String answerText){
        this.answerText = answerText;
    }
}
