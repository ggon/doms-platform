# example cadences
# 4 sets of 8 reps [CHECK!]
# 4 sets of 8 - 10 reps
# 4 sets of 12, 10, 8, 6 [CHECK!]

# maybe keep two separate classes? one being the Rep
# and the other being RepRange. The Rep class would
# be stupid simple though. hmmmm... think about this.
class Rep

	attr_accessor :rep_num, :lower_boundary, :upper_boundary

	def initializer(rep_num)
		@rep_num = rep_num
	end

	def initializer(lower_boundary, upper_boundary)
		validate_range(lower_boundary, upper_boundary)
		@lower_boundary = lower_boundary
		@upper_boundary = upper_boundary
	end

	def validate_range(lower_boundary, upper_boundary)
		if (lower_boundary < 0 || upper_boundary < 1)
			raise 'rep range is not valid'
		end
	end

end

class Cadence

	attr_accessor :sets, :reps, :rep_range

	def initialize()
		@sets = Array.new
	end

	def add_set(reps)
		@sets.push(Rep.new(reps))
	end

	def add_set(lower_bound, upper_bound)
		@sets.push(Rep.new(lower_bound, upper_bound))
	end

	def add_sets(num_of_sets, num_of_reps)
		num_of_sets.times { sets.push(num_of_reps) }
	end

	def add_rest_in_between(time)
		@rest_in_between = time
	end

end
