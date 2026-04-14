import sys

print("Python Program Running in Jenkins")

print("Script Name:", sys.argv[0])

if len(sys.argv) >= 3:
    print("Parameter 1 (Name):", sys.argv[1])
    print("Parameter 2 (Project):", sys.argv[2])
else:
    print("Insufficient parameters passed")
