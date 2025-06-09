const prompt = require("prompt-sync")();

let question1 = {
    qust: "how many days are there in a week",
    opt_a:12,
    opt_b:7,
    opt_c:6,
    opt_d:8	
};

let question2 = {
    qust: "what is the capital of lagos",
    opt_a:"ikeja",
    opt_b:"shomolu",
    opt_c:"ikotun",
    opt_d:"yaba"
   };	

let question3 = {
    qust: "who is Nigerian president",
    opt_a:"jagaban",
    opt_b:"blablablueee",
    opt_c:"Tinubu",
    opt_d:"yewande"	
};

let question4 = {
    qust: "what animal is the king of the jungle",
    opt_a:"goat",
    opt_b:"ant",
    opt_c:"lion",
    opt_d:"pig"	
};

let question5 = {
    qust: "what is the largest living animal",
    opt_a:"sheep",
    opt_b:"elephant",
    opt_c:"blue whale",
    opt_d:"hippo"	
};

let question6 = {
    qust: "what is the fastest animal in the world",
    opt_a:"puncupine",
    opt_b:"walthog",
    opt_c:"cheetah",
    opt_d:"falcon"	
};

let question7 = {
    qust: "what is the largest ocean in the world",
    opt_a:"indian ocean",
    opt_b:"atlantic ocean",
    opt_c:"pacific ocean",
    opt_d:"north sea"	
};

let question8 = {
    qust: "what is the name of batman's first robbin",
    opt_a:"damian wayne",
    opt_b:"dick greyson",
    opt_c:"tim drake",
    opt_d:"tommy hilfreger"	
};

let question9 = {
    qust: "what is Batman dad's full name ?",
    opt_a:"adam wanye",
    opt_b:"wade wayne",
    opt_c:"thomas wayne",
    opt_d:"joseph wayne"	
};

let question10 = {
    qust: "which of these is not a justice league member",
    opt_a:"green Arrow",
    opt_b:"captain Adam",
    opt_c:"black canery",
    opt_d:"deathstroke"	
};



let question11 = {
    qust: "which of these is not a poisonous animal",
    opt_a:"gelly fish",
    opt_b:"black momber",
    opt_c:"komodo dragon",
    opt_d:"lemo"	
};



let totalQuestion = [question1, question2, question3, question4, question5,
question6, question7, question8, question9, question10, question11];






//console.log(totalQuestion.question2);

while(true){
	let randoms = Math.floor(Math.random() * 10);
	let option = totalQuestion[randoms];
	console.log(option);
	
	if(option == question1){ answer =prompt("enter your answer: ");
		if (answer == "d") console.log("you are correct");
		else console.log("you are wrong");
		};


	if(option == question2){ answer =prompt("enter your answer: ");
		if (answer == "a") console.log("you are correct");
		else console.log("you are wrong");
		};

	if(option == question3){ answer =prompt("enter your answer: ");
		if (answer == "c") console.log("you are correct");
		else console.log("you are wrong");
		};

	if(option == question4){ answer =prompt("enter your answer: ");
		if (answer == "c") console.log("you are correct");
		else console.log("you are wrong");
		};

	if(option == question5){ answer =prompt("enter your answer: ");
		if (answer == "c") console.log("you are correct");
		else console.log("you are wrong");
		};

	if(option == question6){ answer =prompt("enter your answer: ");
		if (answer == "d") console.log("you are correct");
		else console.log("you are wrong");
		};

	if(option == question7){ answer =prompt("enter your answer: ");
		if (answer == "c") console.log("you are correct");
		else console.log("you are wrong");
		};

	if(option == question8){ answer =prompt("enter your answer: ");
		if (answer == "b") console.log("you are correct");
		else console.log("you are wrong");
		};

	if(option == question9){ answer =prompt("enter your answer: ");
		if (answer == "c") console.log("you are correct");
		else console.log("you are wrong");
		};

	if(option == question10){ answer =prompt("enter your answer: ");
		if (answer == "d") console.log("you are correct");
		else console.log("you are wrong");
		};

	if(option == question11){ answer =prompt("enter your answer: ");
		if (answer == "d") console.log("you are correct");
		else console.log("you are wrong");
		};



		





};














