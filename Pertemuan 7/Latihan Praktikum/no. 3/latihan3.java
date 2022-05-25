public class latihan3{
    int[] arr;
    int[] idx;
    int counter = 0;
    int max = 0;

    latihan3(int[] x, int y){
        this.arr = new int[y];
        this.idx = new int[y];
        arr = x;
    }

    void tampilarray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    void selectionSort() {
        for (int i = 0; i < arr.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[idxMin]) {
                    idxMin = j;
                }
            }
            int tmp = arr[idxMin];
            arr[idxMin] = arr[i];
            arr[i] = tmp;
        }
    }

    void mencarinilaiterbesar() {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
    }

    void tampiljumlahdanindex() {
        System.out.println("Nilai terbesar adalah : " + max);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                counter++;
                idx[i] = i;
            }
        }
        System.out.println("Jumlah nilai terbesar ada : " + counter);
        System.out.print("terdapat pada indeks : ");
        for (int i = 0; i < arr.length; i++) {
            if (idx[i] != 0) {
                System.out.print(idx[i] + " ");
            } else {
                continue;
            }
        }
    }

    int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == arr[mid]) {
                return (mid);
            } else if (arr[mid] > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    void TampilPosisi(int x, int pos) {
        if (pos != -1) {

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x) {
                    counter++;
                    idx[i] = i;
                }
            }

            System.out.print("data " + x + " ditemukan sebanyak " + counter + " buah\nterletak pada indeks : " + pos);
            for (int i = 0; i < arr.length; i++) {
                if (arr[pos] == arr[i]) {
                    idx[i] = i;
                } if (idx[i] != 0 && i!=pos) {
                    System.out.print(" " + idx[i]);
                }
            }
        } else {
            System.out.println("data : " + x + " tidak ditemukan");
        }
    }

}