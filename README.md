###Random Notes/Thoughts
• maybe create a higher level collection? Something to organize multiple Routines  
• should be able to send other user's your workouts  
	• use-case for this is for coaches to send them to their clients  
• add weights -- will have to tie these to reps (ex. 4 sets of 10 reps @ 45 lbs)  
• add time based exercises (running, planks, etc.)  
• add supersets  
• add rest time in between exercises -- rest in between sets AND exercises... maybe punt on this one for now  
• add notes section (be careful with this as you don't want to make a free database)  
• need a better name for Cadence. Is there even a name for this!?!  
• add login support through Facebook/Google  

###Entities
Routine
+ can you have it without an Workout? yes

Workout
+ can you have it without a Routine? yes, these should be able to be moved to other workouts as well  
+ can you have it without a cadence? yes, although uncommon you can workout without reps and sets  

Cadence  
+ can you have it without a Workout? nope. this MUST be tied to a Workout  
