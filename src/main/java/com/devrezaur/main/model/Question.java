package com.devrezaur.main.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "questions") //It denotes custom name of the database table.
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name="quesId")
	//@JoinColumn(name = "quesId",referencedColumnName="quesId")
	private int quesId;
	private String title;
	private String optionA;
	private String optionB;
	private String optionC;
	private int ans;
	private int chose;
	/*@ManyToOne
	@JoinColumn(name = "haschosen_id")
	private HasChosen haschosen;*/
	@OneToMany(targetEntity = HasChosen.class,cascade = CascadeType.ALL)
	@JoinColumn(name="qh_fk",referencedColumnName = "quesId")
	private List<HasChosen>hasChosens;

	/*public HasChosen getHaschosen() {
		return haschosen;
	}*/

	/*public void setHaschosen(HasChosen haschosen) {
		this.haschosen = haschosen;
	}*/

	//@OneToMany(cascade = CascadeType.ALL)
	//@JoinColumn(name="fk_quesId",referencedColumnName = "quesId")
	//private HasChosen hasc;

	/*public Question() {
		super();
	}

	public Question(int quesId, String title, String optionA, String optionB, String optionC, int ans, int chose) {
		super();
		this.quesId = quesId;
		this.title = title;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.ans = ans;
		this.chose = chose;
	}

	public int getQuesId() {
		return quesId;
	}

	public void setQuesId(int quesId) {
		this.quesId = quesId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOptionA() {
		return optionA;
	}

	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}

	public String getOptionB() {
		return optionB;
	}

	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}

	public String getOptionC() {
		return optionC;
	}

	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}

	public int getAns() {
		return ans;
	}

	public void setAns(int ans) {
		this.ans = ans;
	}

	public int getChose() {
		return chose;
	}

	public void setChose(int choosed) {
		this.chose = choosed;
	}

	@Override
	public String toString() {
		return "Question [quesId=" + quesId + ", title=" + title + ", optionA=" + optionA + ", optionB=" + optionB + ", optionC=" + optionC + ", ans=" + ans + ", chose=" + chose + "]";
	}
*/
}
