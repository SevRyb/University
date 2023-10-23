"""
Implementation of Lab 8
by Severyn Rybka
"""

import sys, math, struct

TXT_FILE_NAME = "file.txt"
BIN_FILE_NAME = "file.bin"


def save_result(value):
	"""
	Saves value to the text and binary file
	:param float value: value
	"""
	with open(TXT_FILE_NAME, "w") as file: 
		file.write(str(value))
	with open(BIN_FILE_NAME, "wb") as file: 
		file.write(struct.pack('d', value))
		
		
def read_txt_result():
	"""
	Reads result from the text file
	:return: result
	"""
	try:
		with open(TXT_FILE_NAME, "r") as file: 
			return float(file.read())
	except FileNotFoundError:
		print("[ERROR] Text file with result doesn't exist!")


def read_bin_result():
	"""
	Reads result from the binary file
	:return: result
	"""
	try:
		with open(BIN_FILE_NAME, "rb") as file: 
			return struct.unpack("d", file.read(8))[0]
	except FileNotFoundError:
		print("[ERROR] Binary file with result doesn't exist!")


def main():
	"""
	Main function
	"""
	x = 0
	y = 0
	try:
		x = float(eval(input("x = ")))
	except:
		print("[ERROR] Incorrect input!")
		sys.exit(-1)

	try:
		y = (x - 4) / math.sin(3 * x - 1)
	except ZeroDivisionError:
		print("[ERROR] Division by zero!")
	else:
		print("y =", y)
		save_result(y)
		
		y_txt = read_txt_result()
		if y_txt != None:
			print("Result from text file:")
			print("y =", y_txt)

		y_bin = read_bin_result()
		if y_bin != None:
			print("Result from binary file:")
			print("y =", y_bin)


if __name__ == "__main__":
	main()
