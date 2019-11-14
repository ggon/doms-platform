
class Workout

	attr_accessor :name, :exercises

	def initialize(name)
		@name = name
		@exercises = Array.new
	end

	def add_exercise(exercise)
		@exercises.push(exercise)
	end

end
