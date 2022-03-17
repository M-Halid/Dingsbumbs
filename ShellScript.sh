#!/bin/sh

echo ""
echo "Fakirlere selam olsun!"
echo ""
let temp=0;

if [ "$2" -gt "$1" ]; then
if [ "$3" = "+" ]; then 
    for ((i=$1;i<=$2;i++))
        do
        temp=$(($temp+$i))
    done
echo "Ergebnis: $temp"
elif [ "$3" = "x" ]; then
    temp=1
    for ((i=$1;i<=$2;i++))
        do
        temp=$(($temp*$i))
    done
echo "Ergebnis: $temp"
fi;
elif [ "$1" -gt "$2" ]; then
if [ "$3" = "+" ]; then 
    for ((i=$2;i<=$1;i++))
        do
        temp=$(($temp+$i))
    done
echo "Ergebnis: $temp"
elif [ "$3" = "x" ]; then
    temp=1
    for ((i=$2;i<=$1;i++))
        do
        temp=$(($temp*$i))
    done
echo "Ergebnis: $temp"
fi;
fi;

