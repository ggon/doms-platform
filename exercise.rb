
class Exercise

	attr_accessor :name, :cadence, :super_set_primary, :super_set_secondary

	def initialize(name)
		@name = name
	end

	def superset_with(exercise)
		@super_set_secondary = exercise.name
		exercise.super_set_primary = @name
	end

	def add_cadence(cadence)
		@cadence = cadence
	end

end
