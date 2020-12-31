# @param {Integer[][]} intervals
# @return {Integer}

def erase_overlap_intervals(intervals)
  return 0 if intervals.empty?
  intervals.sort! { |a, b| a.last <=> b.last }
  count = 1
  x_end = intervals.first.last
  intervals.each do |interval|
    s, e = interval
    if s >= x_end
      count += 1
      x_end = e
    end
  end
  intervals.size - count
end
