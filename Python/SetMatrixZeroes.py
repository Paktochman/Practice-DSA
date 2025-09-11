def set_zeroes(matrix):
    rows, cols = len(matrix), len(matrix[0])
    first_row_zero = any(matrix[0][j] == 0 for j in range(cols))
    first_col_zero = any(matrix[i][0] == 0 for i in range(rows))

    # Use first row and column as markers
    for i in range(1, rows):
        for j in range(1, cols):
            if matrix[i][j] == 0:
                matrix[i][0] = 0
                matrix[0][j] = 0

    # Set zeroes based on markers
    for i in range(1, rows):
        for j in range(1, cols):
            if matrix[i][0] == 0 or matrix[0][j] == 0:
                matrix[i][j] = 0

    # Set first row and column if needed
    if first_row_zero:
        for j in range(cols):
            matrix[0][j] = 0
    if first_col_zero:
        for i in range(rows):
            matrix[i][0] = 0

# Example usage
matrix1 = [[1,1,1],[1,0,1],[1,1,1]]
set_zeroes(matrix1)
print(matrix1)  # [[1,0,1],[0,0,0],[1,0,1]]

matrix2 = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
set_zeroes(matrix2)
print(matrix2)  # [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
