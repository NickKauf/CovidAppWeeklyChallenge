Due to the COVID-19 pandemic of today, everyone is doing their best to stop the spread of the virus by staying home.  Experts already stated that we need to wait until COVID-19 cases actually start to decline over several weeks before reopening businesses and going back to school and work. But once people start resuming their normal routines, it will be essential to trace contacts of a newly infected patient to contain emerging clusters of COVID-19 infections. Contact tracing is a key strategy for preventing further spread of the virus according to the Centers for Disease Control and Prevention. This week’s challenge is to write a Contact Tracing Program that produces a contact report of an infected patient.

 
Requirements:
Write a program that will allow a user to enter in:

    a name, 
    an email address,
    a phone number, 
    an address (city & state),
    at least one symptom:

        name of a symptom,
        number of days with this symptom

    At least one contacted person:

        a name,
        an email address,
        a phone number

 

Functionalities

    Build as an Object-Oriented Program
        must contain multiple classes, implement composition
        use inheritance if/when possible
        all instance variables must be accessed via methods (getters & setters)
    The main method of the program should handle all user interaction

    The data must be kept in a collection (i.e. Array List)
    Must check for all symptoms
    Ensure that users have met the minimum amount of items requirements
    Make the report look pretty!

 

Common signs and symptoms can include:

    Fever
    Cough
    Shortness of breath or difficulty breathing
    Tiredness
    Aches
    Chills
    Sore throat
    Loss of smell
    Loss of taste
    Headache
    Diarrhea
    Severe vomiting



--------------------------------------------------

pseudocode:

classes:
	MainApp
	Report
	Contact
	Symptom


Contact - has name, email, and phone
Symptom - has name, no. of days
Report - has name email, email, phone, city, state, list of symptoms (>=1), list of contacts
	constructors: 
		default: construct new instance of symptom list and contact list;
	methods:
		return the report in a form ready to be printed


MainApp - 
	temp question variables
	scanner
	arraylist
	regex phone
	regex email
	
	main loop
		create a report object

		what is name
			get name
			validation loop (false)
				what is phone
				IF it's valid
					get phone
					set validation to true
				ELSE
					continue
				ENDLOOP
			validation loop (false)
				what is email
				IF it's valid
					get email
					set validation to true
				ELSE
					continue
				ENDLOOP
		What is city
			get city
		what is state
			get state
		
	
		While continue = true
			do you have symptom x
				if yes
					how many days
					get days
					create symptom object(symptomname, days)
					add symptom object to symptom list
				else
					continue
				if symptomlist.size < 1
					print you didnt enter any symptoms, try again
					continue
				else
					continue = false
		While continue = true
			has tempname run into anyone? y/n
				if y
					while anothercontact is true
						create contact object
						what is name
						get name
						set contact name
						what is number
						get number
						set contact number
						what is email
						get email
						set contact email
						add contact to contact list
						ask for another contact y/n
						if y
							continue
						if n
							anothercontact is false
					ENDWHILE
		execute Report's printreport method

					
					
					
		
				
		
				
				

		