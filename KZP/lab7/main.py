"""
Implementation of Lab 7
by Severyn Rybka
"""

def main():
	n = 0
	while True:
		n = int(input("Enter matrix size (numbers >=3): "))
		if n >= 3:
			break
		print("Must be numbers >=3")

	filler = input("Enter filler char: ")

	thick = int(round(n * 0.2))
	thick2 = 2 * thick

	# Create & fill toothed array
	matrix = [[filler for _ in range(n)] for _ in range(thick)]
	matrix.extend([[filler for _ in range(thick2)] for _ in range(thick, thick + (n - thick2))])
	matrix.extend([[filler for _ in range(n)] for _ in range(thick)])
	
	# Print everything
	for row_index, row in enumerate(matrix):
		if row_index < thick or row_index >= n - thick:
			for item in row:
				print(item, end="")
		else:
			j = 0
			for col_index in range(n):
				if col_index < thick or col_index >= n - thick:
					print(row[j], end="")
					j += 1
				else:
					print(" ", end="")
		print()


if __name__ == "__main__":
	main()
