
		console.log("\n >>> Semicolon Assesment App>>>\n");
	   
		let question1 = {
		Question1: "What is the sum of 10 by 10: ",
		
		 A: 2,
		 B: 20,
		 C: 52,
		 D: 11, 	
};	
					
		let question2 = {
		
		Question1: "What the capital of Nigeria: ",

		A: "USA",
		B: "ABUJA",
		C: "LAGOS",
		D: "KANO", 
		 
};	
	
		let question3 = {

		Question1: "multiply 10 by 10: ",

		A: 10,
		B: 100,
		C: 6,
		D: 5,
	
};	
	
		let question4 = {
		
		Question4: "when you divide 100 by 20, what could be the result: ",

		A: "5",
		B: "20",
		C: "30",
		D: "10", 
		 
};	
	
		let question5 = {
		
		Question5: "how many cohort has semicolon produced ",

		A: "1",
		B: "26",
		C: "38",
		D: "20", 
		 
};	
	
		let question6 = {
		
		Question1: "How many champion league trophy does Arsenal Football club has ",

		A: "1",
		B:  "2",
		C: "0",
		D: "13", 
		 
		
};	
	
		let question7 = {
		
		Question1: "Who was the mother of Jesus: ",

		A: "Mary",
		B: "Mather",
		C: "Abigail",
		D: "Helen", 
		 
};	
	
		let question8 = {
		
		Question1: "Most pupolated state in Nigeria: ",

		A: "USA",
		B: "ABUJA",
		C: "LAGOS",
		D: "KANO", 
		 
};	
	
		let question9 = {
		
		Question1: "When did Nigeria got her independance: ",

		A: 1990,
		B: 1960,
		C: 2000,
		D: 2015, 
		 
		
};	
		let question10 = {
		
		Question10: "Which state has the slogan centre of commerce in Nigeria: ",

		A: "USA",
		B: "ABUJA",
		C: "LAGOS",
		D: "KANO", 
		 
};	
	
	
	let Quationaire = {question1, question2,question3,question4,question5,question6,question7,question8,question9,question10};
	
	let option = Math.floor(Math.random(Quationaire) * 10);

	//console.log(Quationaire.question2);
	
	while(true){
				/*	
			let randoms = Math.floor(Math.random() * 10);
			let option = Quationaire[randoms];
			console.log(option);
	*/
	
		let keys = Object.keys(Quationaire);

		let randoms = Math.floor(Math.random() * keys.length);
		let selectedKey = keys[randoms];
		let option = Quationaire[selectedKey];

		console.log(option);
	

	
			if(option == question1){ 
			let answer = prompt("enter your answer: ");
			if (answer === "B" || answer === "b") 
			console.log("you are correct");
			else console.log("you are wrong");
			};

			
		
		
	};

	
	
	
	
	
	
	
	
	
	