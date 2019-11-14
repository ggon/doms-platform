require_relative 'workout'
require_relative 'exercise'
require_relative 'cadence'

# Chest Day Workout
chest_workout = Workout.new('Monday Chest Day')

# normal exercise cadence (4 sets of 10)
dumbell_press = Exercise.new('Incline Dumbell Press')
cadence = Cadence.new
cadence.add_set(10)
cadence.add_set(10)
cadence.add_set(10)
cadence.add_set(10)
dumbell_press.add_cadence(cadence)
chest_workout.add_exercise(dumbell_press)

# lets do a pyramid for these (4 sets, starting at 12 dropping to 6)
bench_press = Exercise.new('Bench Press')
cadence = Cadence.new
cadence.add_set(12)
cadence.add_set(10)
cadence.add_set(8)
cadence.add_set(4,6)
cadence.add_set(4,6)
bench_press.add_cadence(cadence)
chest_workout.add_exercise(bench_press)

# Flys and Push Ups are to be supersetted
flys = Exercise.new('Flys')
cadence = Cadence.new()
cadence.add_sets(4, 12)
flys.add_cadence(cadence)

push_ups = Exercise.new('Push Ups')
cadence = Cadence.new()
cadence.add_sets(4, 15)
push_ups.add_cadence(cadence)
flys.superset_with(push_ups)

# should fix this piece, shouldn't be able to add only one
# exercise from a superset pair of exercises
chest_workout.add_exercise(flys)
chest_workout.add_exercise(push_ups)

puts(chest_workout.inspect)
