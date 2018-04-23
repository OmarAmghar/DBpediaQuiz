package fr.uha.ensisa.dbpediaquizz.questions;

public class QuestionFactory {

	public static Question createQuestion()
	{
		int questionType= (int)(Math.random()*3);
		questionType= 0;
		Question question;
		switch(questionType)
		{
			case 0 : 	question=new QuestionCapitale();
						break;
			case 1 :	question=new QuestionRoiEtPredecesseur();
			break;			
			default : 	question= new QuestionChampionnatFranceFootball();
						break;
		}
		//question= new QuestionChampionnatFranceFootball();
		//question=new QuestionCapitale();
		return question;
	}
	
}
